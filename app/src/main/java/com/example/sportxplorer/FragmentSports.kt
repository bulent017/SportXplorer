package com.example.sportxplorer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sportxplorer.databinding.FragmentSignInDiologBinding
import com.example.sportxplorer.databinding.FragmentSportsBinding


class FragmentSports : Fragment() {
    private var _binding: FragmentSportsBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSportsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setButtonSelected()
    }

    fun setButtonSelected(){

        binding.apply {
            val buttons = arrayOf(
                baseballButton,footballButon,volleyballButon,soccerButton,basketballButton,tennisButton
            )

            for (button in buttons){ //tıklanan butonu seçili hale getirirken diğerlerini seçili olmayan duruma getirir.
                button.setOnClickListener {
                    for (innerButton in buttons){
                        innerButton.isSelected = (innerButton == button)
                    }
                }
            }
        }




    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}