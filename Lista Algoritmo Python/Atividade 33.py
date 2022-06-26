print("Bem vindo ao programa!")
var1=str(input("\nAgora digite seu nome:"))
var4=str(input("Agora digite seu sexo Homem(H) ou Mulher (M):"))
var3=int(input("Agora digite sua idade:"))
var2=float(input("Agora digite seu salario fixo:"))
if (var4 == "H" or var4 == "h"):
    if (var3 >= 30):
        print(f"{var1} Seu salario liquido é igual a: {var2 + 100:.1f} ")

    else:
        print(f"{var1} Seu salario liquido é igual a: {var2 + 50:.1f}")


elif (var4 == "M" or var4 == "m"):
    if (var3 >= 30):
        print(f"{var1} Seu salario liquido é igual a: {var2 + 200:.1f}")

    else:
        print(f"{var1} Seu salario liquido é igual a: {var2 + 80:.1f}")
#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈




