u"""Toda modificão feita, informe com comentários."""


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


class Conta(Pessoa):
    """Recebendo os dados e passando pelo construtor."""

    def __init__(self, nome, cpf):
        """Dados da conta."""
        self.__init__(nome, cpf)
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


class Contato(Conta):
    """Dados do contato."""

    def __init__(self, nome, cpf, num_telefone, email, endereco):
        """Passando os dados pelo construtor e recebendo os dados."""
        self.__init__(nome, cpf)
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
