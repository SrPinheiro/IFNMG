#17. Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.

nmrc = int(input('Digite o número da sua conta: '))
saldo = float(input('Digite o saldo da sua conta: '))
debito = float(input('Digite o debito da sua conta: '))
credito = float(input('Digite o credito da sua conta: '))

saldoa = saldo-debito+credito


print('=-'*30)
print(f'O Cliente de número: {nmrc}\nPossui o saldo atual no valor de: {saldoa}R$')
if (saldoa>=0):
    print('Saldo Positivo')
else:
    print('Saldo Negativo')