                                                         // ************ VB PROGRAM ************


Public Class Form1
Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles
Button1.Click
TextBox3.Text = p5dll.add(Val(TextBox1.Text), Val(TextBox2.Text))
End Sub
Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles
Button2.Click
TextBox3.Text = p5dll.sub1(Val(TextBox1.Text), Val(TextBox2.Text))
End Sub
Private Sub Button3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles
Button3.Click
TextBox3.Text = p5dll.mul(Val(TextBox1.Text), Val(TextBox2.Text))
End Sub
Private Sub Button4_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles
Button4.Click
TextBox3.Text = p5dll.div(Val(TextBox1.Text), Val(TextBox2.Text))
End Sub
Private Sub Button5_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles
Button5.Click
Me.Close()
End Sub
End Class



                                                        // ************ Dll FILE ************
                                                        
Public Module p5dll
Public Function add(ByVal n1 As Integer, ByVal n2 As Integer)
Dim RESULT As String
RESULT = n1 + n2
Return (RESULT)
End Function
Public Function sub1(ByVal n1 As Integer, ByVal n2 As Integer)
Dim RESULT As String
RESULT = n1 - n2
Return (RESULT)
End Function
Public Function mul(ByVal n1 As Integer, ByVal n2 As Integer)
Dim RESULT As String
RESULT = n1 * n2
Return (RESULT)
End Function
Public Function div(ByVal n1 As Integer, ByVal n2 As Integer)
Dim RESULT As String
RESULT = n1 / n2
Return (RESULT)
End Function
End Module
