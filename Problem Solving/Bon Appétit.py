# Bon Appétit
# For instance, input data: 3 10 2 9 \n 1 \n 12
# Expected output: 5

def bonAppetit(bill, k, b):
    s = int(sum(x for i,x in enumerate(bill) if i != k)/2) 
    if (b!=s): print(b-s)
    else: print("Bon Appetit")
