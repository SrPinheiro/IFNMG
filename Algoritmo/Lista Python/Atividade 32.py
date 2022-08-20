data=('','janeiro', 'fevereiro', 'março','abril', 'maio', 'junho', 'julho', 'agosto', 'setembro', 'outubro', 'novembro', 'dezembro')
while 1:
    try:
        var1=int(input('Qual mês você deseja?'))
        if var1 > 12 or var1< 1:
            print('Digite apenas numeros no intervalo de 1-12!')
        else:
            break
    except:
        print('Algo de errado, digite apenas numeros inteiro no intervalo de 1-12!')

print(f'O mês {var1} é o mês {data[var1]}')

#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈
