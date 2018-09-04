u"""Importação da biblioteca de teste."""
from unittest import TestCase, main
"""Importação do sistema bancario com todas suas classes."""
import SistemaBancario as Sb


class test_class_pessoa(TestCase):
    """Testes Classe pessoa."""
    def test_p(self):
        """Teste dos metodos da classe."""
        p = Sb.Contato('Vinicius', "123456976-64", '8856764564'
        ,"viniciuspbu@gail.com", 'Rua aqui')
        self.assertEqual(p.get_nome(), 'Vinicius')


if __name__ == '__main__':
    main()

u"""Teste não estão funcionando!."""
