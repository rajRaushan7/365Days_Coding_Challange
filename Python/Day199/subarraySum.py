arr = [1, -2, 6, -1, 3]

def maxAndMinSum(arr): 
    max = 0
    min = 100000
    for i in range(len(arr)): 
        for j in range(i, len(arr)):
            sum = 0
            for k in range(i, j+1):
                sum += arr[k]
            print(sum)
            if(sum > max):
                max = sum
            if(sum < min):
                min = sum
            
    print("Maximum sum : ", max) 
    print("Minimum sum : ", min)

maxAndMinSum(arr)