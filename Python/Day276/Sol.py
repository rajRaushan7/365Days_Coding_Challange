def reverse(root):
    prev = None
    current = root
    
    while current is not None:
        next_node = current.next   
        current.next = prev
        prev = current             
        current = next_node        
    
    return prev  