"""6. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um algoritmo
que receba um valor de uma compra e mostre o valor das prestações."""

var1= float(input('Digite o valor do produto!'))
var2=int(input('Digite em quantas vezes você vai querer dividir:'))
if 1 > var2 > 5:
    print('Esta loja so trabalha com 1 ate 5 prestações')
else:
    print(f'o valor da prestação sera de R$ {var1/var2:.2f} com um total de {var2} Prestações')

#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈