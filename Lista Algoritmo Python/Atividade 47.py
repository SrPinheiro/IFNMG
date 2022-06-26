#todos os valores serão dividos dentro do print!
def soma(val1,val2):
    som= val1+val2
    sub= val1-val2
    div=val1/val2
    mult=val1*val2
    return som,sub,div, mult


var1=float(input('Digite o 1º número:'))
var2=float(input('Digite o 2º número:'))
print(f'O resultado da soma dos números {var1} e {var2} é: {soma(var1,var2)[0]}\ne o resultado da subtração é: {soma(var1,var2)[1]}')
print(f'O resultado da divisão dos números {var1} e {var2} é: {soma(var1,var2)[2]}\ne o resultado da multiplicação é: {soma(var1,var2)[3]}')
#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈
