package Proyecto2;

import java.util.Scanner;

public class Main extends Cliente {
    public static void main(String[] args){;

        Scanner entrada = new Scanner(System.in);

        Cliente cliente = new Cliente();

         tipoPago = new TPagos();

        Cliente tipoCliente = new Cliente();



        //recogemos los valores ingresados por teclado, datos del cliente

        System.out.print("Ingrese el Nombre del Cliente: ");

        cliente.setNombre(entrada.next());



        //recogemos el valor de lo que el client e va a pagar

        System.out.print("Ingrese el monto a pagar: ");

        tipoPago.setMonto(entrada.nextInt());



        //recogemos el valor para el tipo de cliente

        System.out.print("Ingrese el tipo de cliente: ");

        tipoCliente.setTipoCliente(entrada.next().charAt(0));



        //recogemos el valor del tipo de cliente

        System.out.print("Ingrese el tipo de pago: ");

        tipoPago.setTipoPago(entrada.next().charAt(0));



        switch(tipoCliente.getTipoCliente())

        {

            case('G'): case('g'):

        {

            //realizamos el descuento

            /**/

            switch(tipoPago.getTPago())

            {

                //case para descuento si paga de contado

                case('C'): case('c'):

            {

                tipoPago.setDescuento(tipoPago.getMonto() * 15 / 100);

                tipoPago.setTaPagar(tipoPago.getMonto() - tipoPago.getDescuento());

                System.out.println("Es descuento del 15% es: $" + tipoPago.getDescuento());

                System.out.println("El total a pagar es: $" + tipoPago.getTaPagar());

            }break;

                //case para recargo si paga a plazos

                case('P'): case('p'):

            {

                tipoPago.setRecargo(tipoPago.getMonto() * 10 / 100);

                tipoPago.setTaPagar(tipoPago.getMonto() + tipoPago.getRecargo());

                System.out.println("El recargo del 10% es: $" + tipoPago.getRecargo());

                System.out.println("El total a pagar es: $" + tipoPago.getTaPagar());

            }break;

                default:

                {

                    System.out.println("No existe ningun tipo de pago");

                }

            }





        }break;

            case('A'):case('a'):

        {

            switch(tipoPago.getTipoPago())

            {

                case('C'):case('c'):

            {

                tipoPago.setDescuento(tipoPago.getMonto() * 20 / 100);

                tipoPago.setTaPagar(tipoPago.getMonto()-tipoPago.getDescuento());

                System.out.println("El descuento del 20% es: $" + tipoPago.getDescuento());

                System.out.println("El total a pagar es: $" + tipoPago.getTaPagar());

            }break;



                case('P'):case('p'):

            {

                tipoPago.setRecargo(tipoPago.getMonto() * 5 /100);

                tipoPago.setTaPagar(tipoPago.getMonto() + tipoPago.getRecargo());

                System.out.println("El Recargo de 5% es: $" + tipoPago.getRecargo());

                System.out.println("El total a pagar es: $" + tipoPago.getTaPagar());

            }break;

            }

        }break;





            default:

            {

                System.out.println("No existe ese tipo de cliente");

            }

        }

    }
}

