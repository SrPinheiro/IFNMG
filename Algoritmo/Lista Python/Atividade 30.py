total=0
totalpago=0
print("Bem vindo ao programa!")
while True:
    var1=float(input("digite o valor do veiculo:"))
    if (var1 == 0):
        break
    comb=int(input("Digite o tipo de combustivel: [1]alcool,[2]Gasolina,[3]diesel:"))
    if (comb == 1):
        print(f"o valor do desconto é  {(var1 * 0.25):.1f}, o valor total do carro é : {var1 - (var1 * 0.25)} ", )
        total+= (var1 * 0.25)
        totalpago+= var1 - (var1 * 0.25)

    elif (comb == 2):
        print(f"o valor do desconto é {(var1 * 0.21):.1f},  o valor total do carro é : {var1 - (var1 * 0.25)}")
        total += (var1 * 0.21)
        totalpago += + var1 - (var1 * 0.21)

    elif (comb == 3):
        print(f"o valor do desconto é {(var1 * 0.14):.1f}, o valor total do carro é : {var1 - (var1 * 0.14)}")
        total += (var1 * 0.14)
        totalpago += var1 - (var1 * 0.14)

print(f"total de desconto: {total:.1f} e o total a ser pago: {totalpago}")

#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈


