import math

ab = int(input())
bc = int(input())

angle_rad = math.atan2(ab,bc)
angle_deg = math.degrees(angle_rad)

ans = int(round(angle_deg, 0))
print(f"{ans}\u00b0")
