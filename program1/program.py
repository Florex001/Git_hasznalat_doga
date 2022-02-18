szam1 = float(input("Adja meg az első számot"))

szam2 =float(input("adja meg a második számot"))

if szam1 > szam2:
    print("Az először megadott szám a nagyobb %.2f" %szam1)
elif szam1 < szam2:
    print("A másodszor megadott szám a nagyobb %.2f" %szam2)
else:
    print("A kettő szám egyenlő")
