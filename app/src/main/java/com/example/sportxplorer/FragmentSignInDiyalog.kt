package com.example.sportxplorer

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.Nullable
import com.example.sportxplorer.databinding.FragmentSignInDiologBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class FragmentSignInDiyalog : BottomSheetDialogFragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentSignInDiologBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        setTranparentBackground()
        // Inflate the layout for this fragment
        _binding = FragmentSignInDiologBinding.inflate(inflater, container, false)
        return binding.root



    }
    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            signUpTextButton.setOnClickListener {
                switchToSignUpFragment()


            }
            signInButton.setOnClickListener {
                startActivity(Intent(requireContext(),MainActivity::class.java))

            }

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
    fun switchToSignUpFragment() {
        // Bu fragmenti kapat
        dismiss()

        // İkinci fragmenti oluştur
        val secondFragment = FragmentSignUpDiyalog()

        // İkinci fragmenti göster
        secondFragment.show(parentFragmentManager, secondFragment.tag)
    }



}