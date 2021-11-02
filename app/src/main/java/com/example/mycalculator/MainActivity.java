package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.util.Stack;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView text;

    private Button btn0;//数字1-9
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;

    private Button btn_add;//运算
    private Button btn_sub;
    private Button btn_mul;
    private Button btn_div;
    private Button btn_per;
    private Button btn_fac;
    private Button btn_root;

    private Button btn_pt;
    private Button btn_clear;
    private Button btn_sgd;
    private Button btn_equ;
    private Button btn_left;
    private Button btn_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView) findViewById(R.id.text);
        btn0=(Button) findViewById(R.id.num_0);
        btn1=(Button) findViewById(R.id.num_1);
        btn2=(Button) findViewById(R.id.num_2);
        btn3=(Button) findViewById(R.id.num_3);
        btn4=(Button) findViewById(R.id.num_4);
        btn5=(Button) findViewById(R.id.num_5);
        btn6=(Button) findViewById(R.id.num_6);
        btn7=(Button) findViewById(R.id.num_7);
        btn8=(Button) findViewById(R.id.num_8);
        btn9=(Button) findViewById(R.id.num_9);
        btn_add=(Button) findViewById(R.id.add);
        btn_sub=(Button) findViewById(R.id.subtract);
        btn_mul=(Button) findViewById(R.id.multiply);
        btn_div=(Button) findViewById(R.id.divide);
        btn_sgd=(Button) findViewById(R.id.sgd);
        btn_equ=(Button) findViewById(R.id.equal);
        btn_pt=(Button) findViewById(R.id.point);
        btn_per=(Button) findViewById(R.id.percent);
        btn_fac=(Button) findViewById(R.id.factorial);
        btn_clear=(Button) findViewById(R.id.clear);
        btn_root=(Button) findViewById(R.id.root);
        btn_left=(Button) findViewById(R.id.left);
        btn_right=(Button) findViewById(R.id.right);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_mul.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_sgd.setOnClickListener(this);
        btn_equ.setOnClickListener(this);
        btn_pt.setOnClickListener(this);
        btn_per.setOnClickListener(this);
        btn_fac.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_root.setOnClickListener(this);
        btn_left.setOnClickListener(this);
        btn_right.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String et = text.getText().toString();
        if(et.length()==13)
            Toast.makeText(MainActivity.this,"Max length!",Toast.LENGTH_SHORT).show();
        switch (v.getId()){
            case R.id.num_0:
                if(et.equals("0"))
                    et="0";
                else
                    if(et.charAt(et.length()-1)==')')//右括号后不能之间跟数字
                        Toast.makeText(MainActivity.this,"Format error!",Toast.LENGTH_SHORT).show();
                    else
                        et+="0";
                text.setText(et);
                break;
            case R.id.num_1:
                 if(et.equals("0"))
                    et="1";
                 else
                    if(et.charAt(et.length()-1)==')')
                        Toast.makeText(MainActivity.this,"Format error!",Toast.LENGTH_SHORT).show();
                    else
                         et+="1";
                 text.setText(et);
                 break;
            case R.id.num_2:
                if(et.equals("0"))
                    et="2";
                else
                    if(et.charAt(et.length()-1)==')')
                        Toast.makeText(MainActivity.this,"Format error!",Toast.LENGTH_SHORT).show();
                    else
                        et+="2";
                text.setText(et);
                break;
            case R.id.num_3:
                if(et.equals("0"))
                    et="3";
                else
                    if(et.charAt(et.length()-1)==')')
                        Toast.makeText(MainActivity.this,"Format error!",Toast.LENGTH_SHORT).show();
                    else
                        et+="3";
                text.setText(et);
                break;
            case R.id.num_4:
                if(et.equals("0"))
                    et="4";
                else
                    if(et.charAt(et.length()-1)==')')
                        Toast.makeText(MainActivity.this,"Format error!",Toast.LENGTH_SHORT).show();
                    else
                        et+="4";
                text.setText(et);
                break;
            case R.id.num_5:
                if(et.equals("0"))
                    et="5";
                else
                    if(et.charAt(et.length()-1)==')')
                        Toast.makeText(MainActivity.this,"Format error!",Toast.LENGTH_SHORT).show();
                    else
                        et+="5";
                text.setText(et);
                break;
            case R.id.num_6:
                if(et.equals("0"))
                    et="6";
                else
                    if(et.charAt(et.length()-1)==')')
                        Toast.makeText(MainActivity.this,"Format error!",Toast.LENGTH_SHORT).show();
                    else
                        et+="6";
                text.setText(et);
                break;
            case R.id.num_7:
                if(et.equals("0"))
                    et="7";
                else
                    if(et.charAt(et.length()-1)==')')
                        Toast.makeText(MainActivity.this,"Format error!",Toast.LENGTH_SHORT).show();
                    else
                        et+="7";
                text.setText(et);
                break;
            case R.id.num_8:
                if(et.equals("0"))
                    et="8";
                else
                    if(et.charAt(et.length()-1)==')')
                        Toast.makeText(MainActivity.this,"Format error!",Toast.LENGTH_SHORT).show();
                    else
                        et+="8";
                text.setText(et);
                break;
            case R.id.num_9:
                if(et.equals("0"))
                    et="9";
                else
                    if(et.charAt(et.length()-1)==')')
                        Toast.makeText(MainActivity.this,"Format error!",Toast.LENGTH_SHORT).show();
                    else
                        et+="9";
                text.setText(et);
                break;
            case R.id.clear:
                et="0";
                text.setText(et);
                break;
            case R.id.sgd:
                if(et.equals("0"))
                    et="0";
                else if(et.charAt(0)=='-')
                    et = et.substring(1);
                else
                    et = "-" + et;
                text.setText(et);
                break;
            case R.id.percent:
                if((et.charAt(0)!='-'&&et.contains("-"))||et.contains("+")||et.contains("×")||et.contains("÷")||et.contains("(")||et.contains(")"))
                    Toast.makeText(MainActivity.this,"Can't calculate!",Toast.LENGTH_SHORT).show();
                else{
                    BigDecimal per = new BigDecimal(et);
                    BigDecimal p = new BigDecimal(100);
                    et=per.divide(p).toString();
                }
                text.setText(et);
                break;
            case R.id.point:
                if(isOk(et)||isPoint(et)||et.charAt(et.length()-1)=='('||et.charAt(et.length()-1)==')')
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                else
                    et+=".";
                text.setText(et);
                break;
            case R.id.left:
                if(et.charAt(0)=='0'&&et.length()==1)
                    et="(";
                else if(et.charAt(et.length()-1)=='+'||et.charAt(et.length()-1)=='-'||et.charAt(et.length()-1)=='×'||et.charAt(et.length()-1)=='÷')
                    et+="(";
                else
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                text.setText(et);
                break;
            case R.id.right:
                if(et.charAt(et.length()-1)>='0'&&et.charAt(et.length()-1)<='9')
                    et+=")";
                else
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                text.setText(et);
                break;
            case R.id.add:
                if(isOk(et)||et.charAt(et.length()-1)=='(')
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                else
                    et+="+";
                text.setText(et);
                break;
            case R.id.subtract:
                if(isOk(et)||et.charAt(et.length()-1)=='(')
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                else
                    et+="-";
                text.setText(et);
                break;
            case R.id.multiply:
                if(isOk(et)||et.charAt(et.length()-1)=='(')
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                else
                    et+="×";
                text.setText(et);
                break;
            case R.id.divide:
                if(isOk(et)||et.charAt(et.length()-1)=='(')
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                else
                    et+="÷";
                text.setText(et);
                break;
            case R.id.root:
                if(et.charAt(0)=='-')
                    Toast.makeText(MainActivity.this,"Negative numbers cannot be squared!",Toast.LENGTH_SHORT).show();
                else if(et.contains("+")||et.contains("-")||et.contains("×")||et.contains("÷")||et.contains("(")||et.contains(")"))
                    Toast.makeText(MainActivity.this,"Symbols cannot be squared!",Toast.LENGTH_SHORT).show();
                else{
                    double x=Double.parseDouble(et);
                    x=Math.sqrt(x);
                    String x2=String.format("%.9f",x);
                    x2 = x2.replaceAll("0+?$", "");//去掉多余的0
                    x2 = x2.replaceAll("[.]$", "");//如最后一位是.则去掉
                    text.setText(x2);
                }
                break;
            case R.id.factorial:
                if(et.charAt(0)=='-')
                    Toast.makeText(MainActivity.this,"Not positive!",Toast.LENGTH_SHORT).show();
                else if(et.contains(".")||et.contains("+")||et.contains("-")||et.contains("×")||et.contains("÷")||et.contains("(")||et.contains(")"))
                    Toast.makeText(MainActivity.this,"Not integer!",Toast.LENGTH_SHORT).show();
                else if(et.equals("0"))
                    et="1";
                else {
                    int n = Integer.parseInt(et);
                    if(n>12)
                    {
                        Toast.makeText(MainActivity.this,"Overflow!",Toast.LENGTH_SHORT).show();
                        et="0";
                    }
                    else{
                        int result = 1;
                        for(int i=1;i<=n;i++)
                        {
                            result=result*i;
                        }
                        et=""+result;
                    }
                }
                text.setText(et);
                break;
            case R.id.equal:
                if(et.contains("E")) {
                    Toast.makeText(MainActivity.this, "Can't calculate!", Toast.LENGTH_SHORT).show();
                    et="0";
                }
                else if(isOk(et))
                    Toast.makeText(MainActivity.this,"Please complete the formula!",Toast.LENGTH_SHORT).show();
                else if(isMatch(et))
                    Toast.makeText(MainActivity.this,"Not matching!",Toast.LENGTH_SHORT).show();
                else{
                    et = getResult();
                    if(et.contains("Infinity")) {
                        Toast.makeText(MainActivity.this, "0 cannot be used as a divior!", Toast.LENGTH_SHORT).show();
                        et="0";
                    }
                }
                text.setText(et);
                break;
        }
    }
    public static boolean isOk(String et)
    {
        if(et.charAt(et.length()-1)=='+'||et.charAt(et.length()-1)=='-'||et.charAt(et.length()-1)=='×'||et.charAt(et.length()-1)=='÷'||et.charAt(et.length()-1)=='.')
            return true;
        else
            return false;
    }
    public static boolean isPoint(String et)//判断是否可以输入小数点，通过最后一个运算符和小数点位置比较
    {
        int a,b,c,d,e=0;
        a=et.lastIndexOf("+");
        b=et.lastIndexOf("-");
        c=et.lastIndexOf("×");
        d=et.lastIndexOf("÷");
        e=et.lastIndexOf(".");
        if(e>a&&e>b&&e>c&&e>d)
            return true;
        else
            return false;
    }
    public static boolean isMatch(String et)//括号匹配问题
    {
        Stack<Character> stack = new Stack<Character>();
        int i = 0;
        char ch;
        while(i<et.length())
        {
            ch=et.charAt(i);
            if(ch=='(')
                stack.push(ch);
            else if(ch==')') {
                if(stack.isEmpty())//没有左括号匹配就出错了
                    return true;
                else
                    stack.pop();
            }
            i++;
        }
        if(stack.isEmpty())
            return false;
        else
            return true;
    }
    public static StringBuffer toPostfix(String infix) {//中缀表达式转后缀表达式
        Stack<String> stack = new Stack<String>();   //运算符栈
        StringBuffer postfix = new StringBuffer(infix.length() * 2);//后缀表达式
        int i = 0;
        while (i < infix.length())
        {
            char ch = infix.charAt(i);
            switch (ch) {
                case '+':
                    while (!stack.isEmpty() && !stack.peek().equals("(")) //如果栈不为空且栈顶元素不是"(",则出栈
                        postfix.append(stack.pop());
                    stack.push(ch + "");
                    i++;
                    break;
                case '-':
                    if (i==0) {//第一个数为负数
                        postfix.append(0);
                        postfix.append(" ");
                        stack.push("(");
                        stack.push(ch + "");
                        i++;
                    } else {
                        while (!stack.isEmpty() && !stack.peek().equals("(")) //如果栈不为空且栈顶元素不是"(",则出栈
                            postfix.append(stack.pop());   //且添加到后缀表达式串
                        stack.push(ch + ""); //ch入栈
                        i++;
                    }
                    break;
                case '('://左括号入栈
                    stack.push(ch+"");
                    i++;
                    break;
                case ')'://右括号开始弹栈
                    while(!stack.peek().equals("("))
                        postfix.append(stack.pop());
                    stack.pop();
                    i++;
                    break;
                case '×':
                case '÷':
                    while (!stack.isEmpty() && (stack.peek().equals("×") || stack.peek().equals("÷")))  //如果栈顶元素不为空且栈顶元素是"*"或是"/"时,则出栈
                        postfix.append(stack.pop());
                    stack.push(ch + "");
                    i++;
                    break;
                default://遇到运算数
                    if(i==1&&infix.charAt(0)=='-') {
                        while ((i < infix.length() && ch >= '0' && ch <= '9') || (i < infix.length() && ch == '.')) {
                            postfix.append(ch);
                            i++;
                            if (i < infix.length())
                                ch = infix.charAt(i);
                        }
                        postfix.append(" ");
                        postfix.append(stack.pop());   //添加"-"到后缀表达式串
                        stack.pop();   //把此时位于栈顶的"("弹出，相当于遇到")"
                    }
                    else
                    {
                        while ((i < infix.length() && ch >= '0' && ch <= '9') || (i < infix.length() && ch == '.')) {
                            postfix.append(ch);
                            i++;
                            if (i < infix.length())
                                ch = infix.charAt(i);
                        }
                        postfix.append(" ");
                    }
            }
        }
        while (!stack.isEmpty())       //所有运算符出栈
            postfix.append(stack.pop());
        return postfix;
    }
    public static Double Calculate(StringBuffer postfix) {//计算后缀表达式
        Stack<Double> stack = new Stack<Double>();//运算数栈
        String value = "";
        double val = 0;
        char ch;
        for (int i = 0; i < postfix.length(); i++) {
            ch = postfix.charAt(i);
            if ((ch >= '0' && ch <= '9') || ch == '.') {//数字
                while (ch != ' ') {
                    value += ch;
                    ch = postfix.charAt(++i);
                }
                if (ch == ' ') {//数字结束
                    val = Double.parseDouble(value);
                    value="";
                    stack.push(val);
                }
            } else {
                if (ch != ' ') {//操作符
                    Double y = stack.pop();
                    Double x = stack.pop();
                    switch (ch) {//进行相关计算，注意两个数顺序别错了
                        case '+':
                            val = x + y;
                            break;
                        case '-':
                            val = x - y;
                            break;
                        case '×':
                            val = x * y;
                            break;
                        case '÷':
                            val = x / y;
                            break;
                    }
                    stack.push(val);
                }
            }
        }
        return stack.pop();
    }
    public String getResult()
    {
        String infix = text.getText().toString();
        StringBuffer postfix=toPostfix(infix);
        Double result=Calculate(postfix);
        String re=String.format("%.7f",result);
        re = re.replaceAll("0+?$", "");//去掉多余的0
        re = re.replaceAll("[.]$", "");//如最后一位是.则去掉
        return re;
    }
}