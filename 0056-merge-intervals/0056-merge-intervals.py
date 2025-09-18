class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals.sort(key = lambda x: x[0])
        result = [intervals[0]]

        for interval in intervals[1:]:
            last = result[-1]
            if last[1] >= interval[0]:
                last[1] = max(last[1], interval[1])
            else:
                result.append(interval)
        return result