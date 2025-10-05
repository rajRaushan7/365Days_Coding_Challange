def findLargest(L):
    n = len(L)
    if n == 0:
        return None
    
    low = 0
    high = n - 1
    
    if L[low] <= L[high]:
        return L[high]
        
    while low <= high:
        mid = low + (high - low) // 2
        
        if mid < n - 1 and L[mid] > L[mid + 1]:
            return L[mid]
        
        if L[mid] >= L[low]:
            low = mid + 1
        
        else:
            high = mid - 1
            
    return L[high]