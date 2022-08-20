# Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80, menor que 25 ou igual a 40.

nmr = float(input('Digite um número: '))
if (nmr == 40):
    print('O número digitado é igual a 40!')
elif (nmr < 25):
    print('O número digitado é menor do que 25!')
elif (nmr > 80):
    print('O número digitado é maior do que 80!')
else:
    print('O número digitado não esta no seguinte intervalo: maior que 80, menor que 25 ou igual a 40.')
