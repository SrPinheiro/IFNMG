c=1
ne=0
to=list()
while c<11:
    num=float(input(f'Digite o {c}º número:'))
    if num <0:
        ne+=1
        to.append(num)
    c += 1
print(f'No total tivemos {ne} números negativos!')
print(f'Sendo esses números: {to}')

#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈
