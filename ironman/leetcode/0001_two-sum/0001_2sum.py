'''
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. 
You may assume that each input would have exactly one solution, and you may not use the same element twice. 
You can return the answer in any order.
'''

clas solution:
    def twoSum(self, nums: 'List[int]', target: 'int') -> 'List[int]':
        numMap = {}
        for i in range(len(nums)):
            if numMap.__contains__(target-nums[i]):
               return [numMap.get(target-nums[i], i)]
            else:
               numMap[nums[i]] = i


