id=float(input('Qual a sua idade?'))
tex= 'Sua aposentadoria foi aprovada!'
tem=float(input('Quantos anos você trabalha nesta empresa?'))
if tem > id:
    print('Não existe a possibilidade do seu tempo de trabalho ser maior que seu tempo de vida')
    tem=0
    id=0
if id >= 65:
    print(tex)
elif tem >= 30:
    print(tex)
elif id >=60 and tem >=25:
    print(tex)
else:
    print('Sua aposentadoria não foi aprovada!')

#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈