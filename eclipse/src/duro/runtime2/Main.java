package duro.runtime2;

// jdk.internal ?

import java.lang.reflect.InvocationTargetException;

public class Main extends ClassLoader {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException, InstantiationException {
		/*
		ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cw.visit(Opcodes.V1_1, Opcodes.ACC_PUBLIC, "Example", null, "java/lang/Object", new String[]{"duro/runtime2/MyInterface"});
        
        Method m = Method.getMethod("void <init> ()");
        GeneratorAdapter mg = new GeneratorAdapter(Opcodes.ACC_PUBLIC, m, null, null, cw);
        mg.loadThis();
        mg.invokeConstructor(Type.getType(Object.class), m);
        mg.returnValue();
        mg.endMethod();
        
        m = Method.getMethod("int getResult()");
        mg = new GeneratorAdapter(Opcodes.ACC_PUBLIC, m, null, null, cw);
        mg.push(2);
        mg.push(6);
        mg.visitInsn(GeneratorAdapter.ADD);
        mg.push(8);
        mg.visitInsn(GeneratorAdapter.MUL);
        mg.returnValue();
        mg.endMethod();
        
        PrintWriter pw = new PrintWriter(System.out);
        CheckClassAdapter.verify(new ClassReader(cw.toByteArray()), true, pw);
        
        byte[] code = cw.toByteArray();
        
        Main loader = new Main();
        Class<?> exampleClass = loader.defineClass("Example", code, 0,  code.length);
        MyInterface MyInterface = (MyInterface)exampleClass.newInstance();
        int r = MyInterface.getResult();
        System.out.println(r);
        
        if(1 != 2)
        	return;
		*/
		
		// Actor result = Dispatcher.evaluate(new SquareActor(), new Actor[]
		// {int1, int2});
		Actor result = Dispatcher.evaluate(new Program1(), new Actor[0]);

		System.out.println(result);
	}
}
