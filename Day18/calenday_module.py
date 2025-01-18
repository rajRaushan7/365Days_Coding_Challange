import calendar

month, day, year = map(int, input().split(' '))
weekDay = calendar.weekday(year, month, day)

day_dictionary = {
    0: 'MONDAY',
    1: 'TUESDAY',
    2: 'WEDNESDAY',
    3: 'THURSDAY',
    4: 'FRIDAY',
    5: 'SATURDAY',
    6: 'SUNDAY'
}

print(day_dictionary[weekDay])
