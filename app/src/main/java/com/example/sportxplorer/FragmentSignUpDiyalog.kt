package com.example.sportxplorer

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.example.sportxplorer.databinding.FragmentSignInDiologBinding
import com.example.sportxplorer.databinding.FragmentSignUpDiyalogBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentSignUpDiyalog.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentSignUpDiyalog : BottomSheetDialogFragment() {
    private var _binding: FragmentSignUpDiyalogBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        setTranparentBackground()
        _binding = FragmentSignUpDiyalogBinding.inflate(inflater, container, false)
        return binding.root

        binding.apply {


        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    fun setTranparentBackground(){
        // Bu kod bottom sheet'in arkasındaki arkaplanı şeffaf yapar.
        dialog?.setOnShowListener {
            val bottomSheet = (it as BottomSheetDialog).findViewById<View>(com.google.android.material.R.id.design_bottom_sheet) as FrameLayout?
            bottomSheet?.background = ColorDrawable(Color.TRANSPARENT)
        }

    }


}