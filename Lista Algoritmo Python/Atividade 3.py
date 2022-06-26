"""3. Escrever um algoritmo para dasdeterminar o consumo médio de um automóvel sendo fornecida a distância total
percorrida pelo automóvel e o total de combustível gasto."""
var1= list()
for c in range(1,3):
    if c==1:
        var1.append(float(input(f'Digite a distância: (Km)')))
    else:
        var1.append(float(input(f'Digite o combustível(L):')))
print(f'O consumo médio de combustivel é de: {var1[0]/var1[1]:.1f}Km/L')

#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈