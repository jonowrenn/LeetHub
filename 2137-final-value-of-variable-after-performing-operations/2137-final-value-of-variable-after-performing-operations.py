class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        
        x = 0
        for op in operations:
            # any op containing "++" means increment
            if "++" in op:
                x += 1
            else:
                # otherwise it must be a decrement operation
                x -= 1
        return x
