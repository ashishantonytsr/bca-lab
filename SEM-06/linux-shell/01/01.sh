# Area & Circumference of Circle

# !/bin/bash
echo "Enter the radius"
read rad

area=$(echo "3.14 * $rad * $rad" | bc)
perimeter=$(echo "2 * 3.14 * $rad" | bc)

echo "The area is $area"
echo "The perimeter is $perimeter"


# Expected output
# ---
# Enter the radius
# 3
# The area is 28.26
# The perimeter is 18.84