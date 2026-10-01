Lista de Exercícios — Polimorfismo em Java 

1. Veículos 
Crie uma classe Veiculo com o método: 
void mover() 
Crie duas classes filhas: Carro e Bicicleta. 
Cada uma deve sobrescrever mover() e apresentar uma mensagem diferente. 
No main, crie: 
Veiculo v1 = new Carro(); 
Veiculo v2 = new Bicicleta(); 
Depois, execute o método mover(). 
Pergunta: qual é o comportamento apresentado por cada objeto?

3. Funcionários 
Crie uma classe Funcionario com o método: 
void apresentar() 
Crie duas classes filhas: Professor e Gerente. 
Cada classe deve apresentar uma mensagem diferente. 
No main, utilize: 
Funcionario f1 = new Professor(); 
Funcionario f2 = new Gerente(); 
f1.apresentar(); 
f2.apresentar(); 
Pergunta: onde está o polimorfismo nesse exemplo?

5. Instrumentos musicais 
Crie uma classe Instrumento com o método: 
void tocar() 
Crie as classes: Violao, Piano e Bateria. 
Cada instrumento deve sobrescrever tocar() com uma mensagem diferente. 
No main, crie os objetos utilizando a referência da classe Instrumento. 
Desafio: coloque os três objetos em um vetor e percorra o vetor utilizando for.

7. Sistema de transporte 
Crie a classe Transporte com o método: 
void iniciarViagem() 
Crie as classes: Onibus, Aviao e Navio. 
Cada classe deve implementar seu próprio comportamento para iniciarViagem(). 
No main, crie: 
Transporte[] transportes = new Transporte[3]; 
Adicione os três tipos de transporte ao vetor e utilize um for para chamar iniciarViagem(). 
Pergunta: por que não é necessário criar três for diferentes?

9. Sistema de notificações 
Crie um sistema que permita enviar diferentes tipos de notificações. 
Crie a classe Notificacao com o método: 
void enviar() 
Crie as classes: Email, SMS e WhatsApp. 
Cada uma deve sobrescrever enviar() apresentando uma mensagem diferente. 
Depois, crie: 
Notificacao[] notificacoes = new Notificacao[3]; 
Adicione os três tipos de notificação e percorra o vetor com for. 
Desafio final: crie uma nova classe chamada NotificacaoPush e faça com que ela também 
funcione no mesmo vetor, sem alterar o método for.
