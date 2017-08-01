# RiskRaft - Original concept by Nathan Budke in Java; redesigned by Elliott Maguire for Python.

currentPrice = input("Current Price: ")
peak = input("Peak: ")
low = input("Low: ")

x = float(currentPrice)
a = float(peak)
b = float(low)

y = a - x
z = x - b
r = y - z

initialSellPoint = r / 2
profitSellPoint = x + initialSellPoint
lossSellPoint = x - initialSellPoint

percentRisk = profitSellPoint / x

# advisory block

print("\n" + "Advisory Block" + "\n")

if y < z:
    print("Do Not Buy")
elif y > z:
    print("Buy @ " + str(profitSellPoint) + " and " + str(lossSellPoint))
    print("Risk: " + str(percentRisk) + "%")

# projection block

print("\n" + "Projection Block" + "\n")

prospect = input("Prospect: ")
gross = (prospect / x) * x * percentRisk
net = gross - prospect

print("Net: $" + str(net))
