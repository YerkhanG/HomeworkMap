package com.example.homeworkmap

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.example.homeworkmap.databinding.DialogueMapPuloBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MapBottomSheetPulo(private var expanded: Boolean = false): BottomSheetDialogFragment(){
    private lateinit var binding : DialogueMapPuloBinding
    private lateinit var behavior: BottomSheetBehavior<FrameLayout>
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogueMapPuloBinding.inflate(inflater , container, false)
        return binding.root
    }
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val bottomSheet = super.onCreateDialog(savedInstanceState) as BottomSheetDialog
        behavior = bottomSheet.behavior

        if (expanded) behavior.state = BottomSheetBehavior.STATE_EXPANDED
        return bottomSheet
    }
}
