class Triangle:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c 
        
    def Is_valid(self):
        v = False
        if (self.a + self.b > self.c and self.a + self.c > self.b and self.b + self.c > self.a):
            return "Valid"
        return "Invalid"
    
    def Side_Classification(self): 
        if (self.Is_valid() == "Valid"):
            if self.a == self.b == self.c:
                return "Equilateral"
            elif self.a == self.b or self.a == self.c or self.b == self.c:
                return "Isosceles"
            else:
                return "Scalene"
        return "Invalid"
            
    def Angle_Classification(self):
        if (self.Is_valid() == "Valid"): 
            sides = sorted([self.a, self.b, self.c])
            x, y, z = sides
            if x**2 + y**2 > z**2:
                return "Acute"
            elif x**2 + y**2 == z**2:
                return "Right"
            else:
                return "Obtuse"
        return "Invalid"
                
    def Area(self):
        if (self.Is_valid() == "Valid"):  
            s = (self.a + self.b + self.c) / 2
            a = s*(s-self.a)*(s-self.b)*(s-self.c)
            area = a**0.5
            return area
        return "Invalid"

a=int(input())
b=int(input())
c=int(input())
T=Triangle(a,b,c)
print(T.Is_valid())
print(T.Side_Classification())
print(T.Angle_Classification())
print(T.Area())