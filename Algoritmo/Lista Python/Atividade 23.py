# Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. Informe média de preço de custo e do preço de venda.
custo = list()
venda = list()
for i in range(1, 41):
    print('=-'*30)
    print(f'Produto número {i}')
    print('=-'*30)
    preco_custo = float(input('Digite o preço de custo do produto: '))
    custo.append(preco_custo)
    preco_venda = float(input('Digite o preço de venda do produto: '))
    venda.append(preco_venda)
    if (preco_custo > preco_venda):
        print('Houve PREJUÍZO!')
    elif (preco_custo < preco_venda):
        print('Houve LUCRO!')
    elif (preco_custo == preco_venda):
        print('Houve EMPATE!')

print('=-'*30)
print(f'A média de preço de CUSTO é {sum(custo)/len(custo):.1f}R$ \n A média de preço de VENDA é {sum(venda)/len(venda):.1f}R$')
