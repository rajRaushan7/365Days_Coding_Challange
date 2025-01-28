if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    
    total = 0
    count = 0
    for key in student_marks:
        if key == query_name:
            for marks in student_marks[key]:
                total += marks
                count += 1
            avg = total/count
    print("{:.2f}".format(avg))
