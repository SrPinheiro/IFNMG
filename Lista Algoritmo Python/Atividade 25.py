# Crie um programa onde o usuário informe os valores dos catetos de um triângulo e que ao final mostre a sua hipotenusa. De acordo com o teorema de Pitágoras, toda hipotenusa é constituída pela soma dos quadrados de cada cateto. Sendo assim, a fórmula mais conhecida para o cálculo da hipotenusa é a seguinte: a² + b² = c²

a = float(input('Digite o valor do primeiro cateto: '))
a = a**2
b = float(input('Digite o valor do segundo cateto: '))
b = b**2

print(f'A hipotenusa dos valores informados é {a+b}')