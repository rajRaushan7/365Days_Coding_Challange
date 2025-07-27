import numpy as np

# Data structure : [ restaurant_id, 2022, 2023, 2024, 2025]

sales_data = np.array([
    [1, 150000, 180000, 220000, 250000],  # Paradise Biryani
    [2, 120000, 140000, 160000, 190000],  # Beijing Bites
    [3, 200000, 230000, 260000, 300000],  # Pizza Hub
    [4, 180000, 210000, 240000, 270000],  # Burger Point
    [5, 160000, 185000, 205000, 230000]   # Chai Point
])

print("=== Zomate sales analysis ===")

print("Sales data shape : ", sales_data.shape)
print("First three restaurant data  : \n", sales_data[:3, 1:])

# tatal sales per year 
print('Total sales per year : \n', np.sum(sales_data[:, 1:], axis=0))

# minimum sales per restaurant
print('Minimum sales per restaurant : \n', np.min(sales_data[:, 1:], axis=1))

# maximum sales per year 
print('Maximum sales per year : \n ', np.max(sales_data[:, 1:], axis=0))

# average sales per restaurant 
print('Average sales per restaurant : \n', np.mean(sales_data[:, 1:], axis=1))

# cumulative sales 
cumulativeSum = np.cumsum(sales_data[:, 1:], axis=1)
print('Cumulative sales : \n', cumulativeSum)  # nth year tk rastaurant ne kitni sales ki

# Graph of cumulative sales (using matplotlib)
plt.figure(figsize=(10, 6))
plt.plot(np.mean(cumulativeSum, axis=0))
plt.title("Average cumulative sales across all restaurant")
plt.xlabel("Years")
plt.ylabel("Sales")

vector1 = np.array([1, 2, 3, 4])
vector2 = np.array([5, 4, 2, 7])

print('Vector addition : ', vector1 + vector2)

print('Cross prodect : ', vector1 * vector2)

print('Dot Product : ', np.dot(vector1, vector2))

print('Angle between vector1 and vector2 : ', )