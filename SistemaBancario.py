"""Toda modificão feita, informe com comentários."""

class Pessoa:
    """Classe para guardar dados das pessoas."""

    def __init__(self, nome, cpf):
        """Valores para pessoa."""
        self.nome = nome
        self.__cpf = cpf

    def get_nome(self):
        """Retorna nome."""
        return self.nome

    def set_nome(self, nome):
        """Atualiza nome."""
        self.nome = nome

    def get_cpf(self):
        """Retorna CPF."""
        return self.__cpf

    def set_cpf(self, cpf):
        """Atualiza CPF."""
        self.__cpf = cpf

class Conta:
    def __init__(self):
        """Dados da conta.."""
        self.__num_conta = ''
        self.__senha = ''
        self.__saldo = 0

    def get_num_conta(self):
        """Retorna numero da conta."""
        return self.__num_conta

    def get_senha(self):
        """Retorna senha."""
        return self.__senha

    def set_senha(self, senha):
        """Atualiza senha."""
        self.__senha = senha

    def get_saldo(self):
        """Retorna Saldo."""
        return self.__saldo

    def set_saldo(self, saldo):
        """Atualiza Saldo."""
        self.__saldo = saldo
