if __name__ == '__main__':
    records = []
    for _ in range(int(input())):
        student = []
        name = input()
        score = float(input())
        
        student.append(name)
        student.append(score)
        
        records.append(student)
    
    marks = []
    for i in range(len(records)):
        mark = records[i][1]
        marks.append(mark)
        
    def second_lowest_marks(lst):
        lst = set(lst)
        lst = list(lst)
        lst.sort()
        return lst[1]
        
    second_lowest = second_lowest_marks(marks)
    students = []
    for i in range(len(records)):
        if records[i][1] == second_lowest:
            students.append(records[i][0])
            
    students.sort()
    for student in students:
        print(student)
            
            
