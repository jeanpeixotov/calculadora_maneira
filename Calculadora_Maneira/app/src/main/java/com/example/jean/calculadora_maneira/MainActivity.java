package com.example.jean.calculadora_maneira;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{
    TextView resultado;
    String resultado_atual,resultado_anterior ;
    boolean resultadoTemporario=false;
    int operando=0;

    @Override public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado=(TextView)findViewById(R.id.resultado);

        int numeros[]={R.id.btn_zero,R.id.btn_um,R.id.btn_tres,R.id.btn_quatro,R.id.btn_cinco,R.id.btn_seis,R.id.btn_sete,R.id.btn_oito,R.id.btn_nove};

        NumberButtonClickListener numberClickListener=new NumberButtonClickListener();

        for(int id:numeros)
        { View v=findViewById(id);
            v.setOnClickListener(numberClickListener);
        }

        int operacoes[]={R.id.btn_soma,R.id.btn_menos,R.id.btn_multiplicacao,R.id.btn_divisao,R.id.btn_ponto,R.id.btn_delete,R.id.btn_igual};
        OpperandButtonClickListener oppClickListener=new OpperandButtonClickListener();

        for(int id:operacoes)
        { View v=findViewById(id);
            v.setOnClickListener(oppClickListener);
        }
        setResultadoAtual("0");
    }

    void setResultadoAtual(String s) {
        resultado_atual=s;
        resultado.setText(s);
    }
    class NumberButtonClickListener implements OnClickListener
    {   @Override
        public void onClick(View v)
        {   if(resultadoTemporario)
            {   resultado_anterior =resultado_atual;
                resultado_atual="0";
                resultadoTemporario=false;
            }
            //onde eu pego os numeros
            String text=(String)((Button)v).getText();
            //
            if(resultado_atual.equals("0"))setResultadoAtual(text);
            else setResultadoAtual(resultado_atual+text);
        }
    }
    class OpperandButtonClickListener implements OnClickListener
    {
        @Override public void onClick(View v)
         {  int id=v.getId();
            if(id==R.id.btn_delete)
            {   resultadoTemporario=false;
                setResultadoAtual("0");
                resultado_atual=null;
            }
            if(id==R.id.btn_ponto)
                if(!resultado_atual.contains("."))setResultadoAtual(resultado_atual+".");
            if(id==R.id.btn_soma||id==R.id.btn_menos||id==R.id.btn_multiplicacao||id==R.id.btn_divisao)
            {   operando=id;
                resultado_anterior =resultado_atual;
                resultadoTemporario=true;
            }
            if(id==R.id.btn_igual)
            {   double atual=Double.parseDouble(resultado_atual);
                double resultado=0;
                if(resultado_anterior!=null)
                { double anterior=Double.parseDouble(resultado_anterior);
                    switch(operando)
                    { case R.id.btn_soma: resultado=anterior+atual; break;
                        case R.id.btn_menos: resultado=anterior-atual; break;
                        case R.id.btn_multiplicacao: resultado=anterior*atual; break;
                        case R.id.btn_divisao: resultado=anterior/atual; break;
                    }
                }
                setResultadoAtual(Double.toString(resultado));
            }
        }
    }
}

