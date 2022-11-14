package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentFirstBinding


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //binding.textView25.text = binding.a1b1.text
        /*binding.button2.setOnClickListener {
            //findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)

        }*/
        val constnum = binding.a1b1.text.toString().toInt()
        var tikker=0
        binding.buttonFirst.setOnClickListener {

            val a1b1 = binding.a1b1.text.toString().toInt()
            val a2b1 = binding.a2b1.text.toString().toInt()
            val a3b1 = binding.a3b1.text.toString().toInt()
            val a4b1 = binding.b1zap.text.toString().toInt()

            val a1b2 = binding.a1b2.text.toString().toInt()
            val a2b2 = binding.a2b2.text.toString().toInt()
            val a3b2 = binding.a3b2.text.toString().toInt()
            val a4b2 = binding.b2zap.text.toString().toInt()

            val a1b3 = binding.a1b3.text.toString().toInt()
            val a2b3 = binding.a2b3.text.toString().toInt()
            val a3b3 = binding.a3b3.text.toString().toInt()
            val a4b3 = binding.b3zap.text.toString().toInt()

            val pot1 = binding.pot1.text.toString().toInt()
            val pot2 = binding.pot2.text.toString().toInt()
            val pot3 = binding.pot3.text.toString().toInt()

            val tv1 = binding.textView25.text.toString().toInt()
            val tv2 = binding.textView26.text.toString().toInt()
            val tv3 = binding.textView27.text.toString().toInt()

            val tv4 = binding.textView28.text.toString().toInt()
            val tv5 = binding.textView29.text.toString().toInt()
            val tv6 = binding.textView30.text.toString().toInt()

            val tv7 = binding.textView31.text.toString().toInt()
            val tv8 = binding.textView32.text.toString().toInt()
            val tv9 = binding.textView33.text.toString().toInt()


            val blok1 = binding.blok1.text.toString().toInt()
            val blok2 = binding.blok2.text.toString().toInt()
            val blok3 = binding.blok3.text.toString().toInt()

            val blok4 = binding.blok4.text.toString().toInt()
            val blok5 = binding.blok5.text.toString().toInt()
            val blok6 = binding.blok6.text.toString().toInt()

            val blok7 = binding.blok7.text.toString().toInt()
            val blok8 = binding.blok8.text.toString().toInt()
            val blok9 = binding.blok9.text.toString().toInt()

            if (tikker==0){
                binding.textView11.text=(pot1+pot2+pot3).toString()
                binding.textView10.text=(a4b1+a4b2+a4b3).toString()
                tikker=1
            }else{
                println("end")
            }

            val arr = arrayOf(
                arrayOf(intArrayOf(a1b1, tv1, blok1), intArrayOf(a2b1, tv2, blok2), intArrayOf(a3b1, tv3, blok3),intArrayOf(a4b1, 0, 0)),
                arrayOf(intArrayOf(a1b2, tv4, blok4), intArrayOf(a2b2, tv5, blok5), intArrayOf(a3b2, tv6, blok6),intArrayOf(a4b2, 0, 0)),
                arrayOf(intArrayOf(a1b3, tv7, blok7), intArrayOf(a2b3, tv8, blok8), intArrayOf(a3b3, tv9, blok9),intArrayOf(a4b3, 0, 0)),
                arrayOf(intArrayOf(pot1, 0, 0), intArrayOf(pot2, 0, 0), intArrayOf(pot3, 0, 0))
            )

            fun swither(rowid:Int,colid:Int,text:Int) {
                if (rowid==0 && colid==0){
                    binding.textView25.text = text.toString()
                }
                if (rowid==0 && colid==1){
                    binding.textView26.text = text.toString()
                }
                if (rowid==0 && colid==2){
                    binding.textView27.text = text.toString()
                }
                if (rowid==0 && colid==3){
                    //binding.textView25.text = text.toString()
                }

                if (rowid==1 && colid==0){
                    binding.textView28.text = text.toString()
                }
                if (rowid==1 && colid==1){
                    binding.textView29.text = text.toString()
                }
                if (rowid==1 && colid==2){
                    binding.textView30.text = text.toString()
                }
                if (rowid==1 && colid==3){
                    //binding.textView25.text = text.toString()
                }

                if (rowid==2 && colid==0){
                    binding.textView31.text = text.toString()
                }
                if (rowid==2 && colid==1){
                    binding.textView32.text = text.toString()
                }
                if (rowid==2 && colid==2){
                    binding.textView33.text = text.toString()
                }
                if (rowid==2 && colid==3){
                    //binding.textView25.text = text.toString()
                }

                if (rowid==3 && colid==0){
                    binding.textView25.text = text.toString()
                }
                if (rowid==3 && colid==1){
                    binding.textView25.text = text.toString()
                }
                if (rowid==3 && colid==2){
                    binding.textView25.text = text.toString()
                }
            }
            fun swithernum(rowid:Int,colid:Int,text:String) {
                if (rowid==0 && colid==0 && arr[0][0][1]<0){
                    binding.textView25.setText(text)
                    binding.textView25.visibility=View.VISIBLE
                    binding.blok1.text="1"
                }
                if (rowid==0 && colid==1 && arr[0][1][1]<0){
                    binding.textView26.setText(text)
                    binding.textView26.visibility=View.VISIBLE
                    binding.blok2.text="1"
                }
                if (rowid==0 && colid==2 && arr[0][2][1]<0){
                    binding.textView27.setText(text)
                    binding.textView27.visibility=View.VISIBLE
                    binding.blok3.text="1"
                }

                if (rowid==1 && colid==0 && arr[1][0][1]<0){
                    binding.textView28.setText(text)
                    binding.textView28.visibility=View.VISIBLE
                    binding.blok4.text="1"
                }
                if (rowid==1 && colid==1 && arr[1][1][1]<0){
                    binding.textView29.setText(text)
                    binding.textView29.visibility=View.VISIBLE
                    binding.blok5.text="1"
                }
                if (rowid==1 && colid==2 && arr[1][2][1]<0){
                    binding.textView30.setText(text)
                    binding.textView30.visibility=View.VISIBLE
                    binding.blok6.text="1"
                }


                if (rowid==2 && colid==0 && arr[2][0][1]<0){
                    binding.textView31.setText(text)
                    binding.textView31.visibility=View.VISIBLE
                    binding.blok7.text="1"
                }
                if (rowid==2 && colid==1 && arr[2][1][1]<0){
                    binding.textView32.setText(text)
                    binding.textView32.visibility=View.VISIBLE
                    binding.blok8.text="1"
                }
                if (rowid==2 && colid==2 && arr[2][2][1]<0){
                    binding.textView33.setText(text)
                    binding.textView33.visibility=View.VISIBLE
                    binding.blok9.text="1"
                }
            }
            fun switherrow(rowId:Int,text:Int){
                if (rowId==0){
                    binding.b1zap.setText(text.toString())
                }
                if (rowId==1){
                    binding.b2zap.setText(text.toString())
                }
                if (rowId==2){
                    binding.b3zap.setText(text.toString())
                }
            }
            fun swithercol(colId:Int,text:Int){
                if (colId==0){
                    binding.pot1.setText(text.toString())
                }
                if (colId==1){
                    binding.pot2.setText(text.toString())
                }
                if (colId==2){
                    binding.pot3.setText(text.toString())
                }
            }
            fun comporator(row:Int,col:Int,numrow:Int,numcol:Int,array: Array<Array<IntArray>>){
                if (row>col){
                    //удаляем столбец
                    val num = row-col
                    for (index in 0..array.size-2) {
                        swithernum(index,numcol,"0")
                        println(array[numrow][index])
                    }
                    swither(numrow,numcol,col)
                    switherrow(numrow,num)
                    swithercol(numcol,0)
                }
                if (col>row){
                    //удаляем строку
                    val num = col-row
                    for (index in 0..array.size-2) {
                        swithernum(numrow,index,"0")
                        println(array[index][numcol])
                    }
                    swither(numrow,numcol,row)
                    switherrow(numrow,0)
                    swithercol(numcol,num)
                }
                if (col==row){
                    //удаляем строку и столбец
                    for (index in 0..array.size-2) {
                        swithernum(numrow,index,"0")
                        swithernum(index,numcol,"0")
                    }
                    swither(numrow,numcol,row)
                    switherrow(numrow,0)
                    swithercol(numcol,0)
                }
            }
            var colss=0
            var rowss=0
            var constantss=constnum
            if (arr[3][0][0]+arr[3][1][0]+arr[3][2][0]!=arr[0][3][0]+arr[1][3][0]+arr[2][3][0]){
                println("stop")
                binding.textvv.visibility= View.VISIBLE
                binding.textvv.text="Введите правильное число"
            }else{
                binding.textvv.visibility= View.GONE
                for (index in 0..arr.size-1) {
                    for (arre in 0..arr[index].size-1){
                        if (arr[index][arre][0]<=constantss && arr[index][arre][1] !=0 && arr[index][arre][2]==0){
                            constantss=arr[index][arre][0]
                            colss=arre
                            rowss=index
                        }
                    }
                }
                println(rowss.toString()+" "+colss.toString())
                //swither(rowss,colss,arr[rowss][3])
                comporator(arr[rowss][3][0],arr[3][colss][0],rowss,colss,arr)
                //println(arr[rowss][3]-arr[3][colss])
                if (arr[3][0][0]+arr[3][1][0]+arr[3][2][0]==0 && arr[0][3][0]+arr[1][3][0]+arr[2][3][0]==0){
                    binding.textvv.visibility= View.VISIBLE
                    binding.textvv.text="Опорный план построен!"
                }
            }


        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

