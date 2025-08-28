package br.com.morita.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class APPReflections {
    public static void main(String[] args) {

        Class nomeDaClase = Produto.class;

        System.out.println(nomeDaClase.getSimpleName());

        try {
            Constructor cons = nomeDaClase.getConstructor();
            System.out.println(cons);
            Produto prod1 = (Produto) cons.newInstance();
            System.out.println(prod1);

            Field[] fields = prod1.getClass().getDeclaredFields();

            for (Field f : fields) {
                String name = f.getName();
                Class<?> tipo = f.getType();
                System.out.println(name);
                System.out.println(tipo);
            }

            Method[] metodos = prod1.getClass().getDeclaredMethods();

            for (Method m : metodos) {
                Class<?> tipo = m.getReturnType();
                String nome = m.getName();
                System.out.println(tipo);
                System.out.println(nome);
            }

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }
}
