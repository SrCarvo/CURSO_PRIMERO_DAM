using _1__PruebasUnitarias;
using NUnit.Framework;
using NUnit.Framework.Constraints;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1___TestPruebasUnitarias
{
    [TestFixture]
    public class UsuarioTest
    {
        private Usuario usuario;

        [SetUp]
        public void SetUp()
        {
            usuario = new Usuario();
        }
        [TestCase( "", false)] //contraseña nula
        [TestCase("ab12", false)] //contraseña menos de 7 caracteres
        [TestCase("Aabc1224asdaassd", false)] //contraseña mas de 12 caracteres
        [TestCase("abcdefg", false)] //contraseña sin valores numéricos
        [TestCase("abcdef12", false)] //contraseña sin letras mayusculas
        [TestCase("Abcdef12", true)] //contraseña con todas las ocndiciones señaladas en la funcion
        public void ComprobarUsuario(string password, bool expected)
        {
            bool result = usuario.CheckPassword(password);
            Assert.That<bool>(result, Is.EqualTo(expected));
        }
        

    }
}
