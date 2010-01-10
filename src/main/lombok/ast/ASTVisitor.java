/*
 * Copyright © 2010 Reinier Zwitserloot and Roel Spilker.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package lombok.ast;

public interface ASTVisitor {
	public boolean visitIf(If node);
	public boolean visitFor(For node);
	public boolean visitForEach(ForEach node);
	public boolean visitTry(Try node);
	public boolean visitCatch(Catch node);
	public boolean visitWhile(While node);
	public boolean visitDoWhile(DoWhile node);
	public boolean visitSynchronized(Synchronized node);
	public boolean visitBlock(Block node);
	public boolean visitAssert(Assert node);
	public boolean visitVariableDeclaration(VariableDeclaration node);
	public boolean visitVariableDeclarationEntry(VariableDeclarationEntry node);
	public boolean visitType(Type node);
	public boolean visitIdentifier(Identifier node);
	public boolean visitIntegralLiteral(IntegralLiteral node);
	public boolean visitFloatingPointLiteral(FloatingPointLiteral node);
	public boolean visitBooleanLiteral(BooleanLiteral node);
	public boolean visitCharLiteral(CharLiteral node);
	public boolean visitStringLiteral(StringLiteral node);
	public boolean visitNullLiteral(NullLiteral node);
}