u"""Toda modificão feita, informe com comentários."""


class Pessoa:
    """Classe para guardar dados das pessoas."""

    def __init__(self, nome, cpf):
        """Valores para pessoa."""
        self.nome = nome
        self._cpf = cpf

    def get_nome(self):
        """Retorna nome."""
        return self.nome

    def set_nome(self, nome):
        """Atualiza nome."""
        self.nome = nome

    def get_cpf(self):
        """Retorna CPF."""
        return self._cpf

    def set_cpf(self, cpf):
        """Atualiza CPF."""
        self._cpf = cpf


class Conta(Pessoa):
    """Recebendo os dados e passando pelo construtor."""

    def __init__(self, nome, cpf):
        """Dados da conta."""
        super().__init__(nome, cpf)
        self._num_conta = ''
        self._senha = ''
        self._saldo = 0
        self._extrato = []


    def get_num_conta(self):
        """Retorna numero da conta."""
        return self._num_conta

    def get_senha(self):
        """Retorna senha."""
        return self._senha

    def set_senha(self, senha):
        """Atualiza senha."""
        self._senha = senha

    def get_saldo(self):
        """Retorna Saldo."""
        return self._saldo

    def get_extrato(self):
        """Retorna Extrato."""
        return self._extrato

    def sacar(self, valor):
        """Saca (retira) um valor da conta"""
        if(valor > (self.saldo + 5.00)):
            print('Impossivel Sacar este valor | Saldo insuficiente')
        else:
            self.saldo -= (valor+5.0)
            self.extrato.append("Saque de: {0: .2f} R$".format(valor))
        
    def depositar(self, valor):
        """Deposita (adiciona) um valor na conta"""
        self.deposita += (valor-5.00)
        self.extrato.append("Deposito de: {0: .2f} R$ ".format(valor))
        
    def transferir(self, conta, valor):
        """transfere valor de uma conta a outra"""
        if(valor > (self.saldo + 5.00)):
            print('Impossivel Transferir este valor | Saldo insuficiente')
        else:
            conta.depositar(valor)
            self.sacar(valor+5.0)
            self.extrato.append("Tranferência de: {0:.2f} R$".format(valor))

    def imprimirExtrato(self):
        print("Numero da conta: {0}".format(self.num_conta))
        for i in self.range(0,5):
            print(i + " " + self.extrato[i])
            
    def verificarSaldo(self):
         print("Numero da conta: {0}".format(self.num_conta))
         print("Saldo: {0:.2f}".format(self.saldo))
         

class Contato(Conta):
    """Dados do contato."""

    def __init__(self, nome, cpf, num_telefone, email, endereco):
        """Passando os dados pelo construtor e recebendo os dados."""
        super().__init__(nome, cpf)
        self.num_telefone = num_telefone
        self.email = email
        self.endereco = endereco

    def get_num_telefone(self):
        """Retorna o numero telefone."""
        return self.num_telefone

    def set_num_telefone(self, num_telefone):
        """Atualiza telefone."""
        self.num_telefone = num_telefone

    def get_email(self):
        """Retorna email."""
        return self.email

    def set_email(self, email):
        """Atualiza email."""
        self.email = email

    def get_endereco(self):
        u"""Retorna endereço."""
        return self.endereco

    def set_endereco(self, endereco):
        u"""Atualiza endereço."""
        self.endereco = endereco

