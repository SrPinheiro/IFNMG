"""8. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10."""
var1=float(input('Digite um numero:'))
if var1 >10:
    print(f'O número {var1} é maior que 10!')
elif var1 == 10:
    print(f'o numero que você digitou é igual a 10!')
else:
    print(f'O numero {var1} é menor que 10!')