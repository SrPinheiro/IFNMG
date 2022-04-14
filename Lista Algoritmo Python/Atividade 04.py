"""4. Escrever um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No
final informar o nome do aluno e a sua média (aritmética)."""
var1=str(input('Porfavor, digite seu nome:'))
var2=list()
for c in range(1,4):
    var2.append(float(input(f'Digite sua {c}º Nota:')))
print(f'A média das notas é igual a {sum(var2)/len(var2):.1f}!')

#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈
