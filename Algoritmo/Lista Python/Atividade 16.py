#16. Faça um programa que receba dois números e execute uma das operações listadas a seguir de acordo com a escolha do usuário. Se for digitada uma opção inválida mostrar mensagem de erro e terminar o programa. As opções são:
#• Média entre os dois números.
#• Diferença do maior pelo menor.
#• produto entre os dois números.

num1 = float(input('digite o primeiro número: '))
num2 = float(input('digite o segundo número: '))

op = str(input('Qual operação você deseja realizar? \nMédia = M\nDiferença do maior pelo menor = D\nProduto entre os dois números = P\n'))

if (op == 'M' or op == 'm'):
    media = (num1+num2)/2
    print(f'A média entre os dois números é: {media}')
elif (op == 'd' or op == 'D'):
    if (num1>num2):
        print(f'O número {num1} é maior do que o número {num2}')
    else:
        print(f'O número {num2} é maior do que o número {num1}')
elif (op == 'p' or op == 'P'):
    produto = num1*num2
    print(f'O produto entre o número {num1} e o número {num2} é {produto}')