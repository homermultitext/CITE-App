package citeapp

import com.thoughtworks.binding.{Binding, dom}
import com.thoughtworks.binding.Binding.{BindingSeq, Var, Vars}
import scala.scalajs.js
import scala.scalajs.js._
import org.scalajs.dom._
import org.scalajs.dom.ext._
import org.scalajs.dom.raw._
import org.scalajs.dom.document
import org.scalajs.dom.raw.Event
import org.scalajs.dom.ext.Ajax
import edu.holycross.shot.cite._
import edu.holycross.shot.ohco2._
import edu.holycross.shot.citeobj._

import js.annotation._


@JSExportTopLevel("citeapp.CiteMainView")
object CiteMainView {

	val textView = O2View.o2div
	val ngramView = NGView.nGdiv



	// *** Apropos Microservice ***
	// We will want a switch here
	@dom
	def filePicker = {
		<span id="app_filePickerSpan">
			<label for="app_filePicker">Choose a local <code>.cex</code> file</label>
			<input
				id="app_filePicker"
				type="file"
				onchange={ event: Event => CiteMainController.loadLocalLibrary( event )}
				></input>
		</span>
	}


	@dom
	def mainMessageDiv = {
			<div id="main_message" class={ s"app_message ${CiteMainModel.userMessageVisibility.bind} ${CiteMainModel.userAlert.bind}" } >
				<p> { CiteMainModel.userMessage.bind }  </p>
			</div>
	}

	@dom
	def mainDiv = {

		<header>
			{ filePicker.bind }
			CITE Environment
			<span id="app_header_versionInfo">version { BuildInfo.version }</span>
			<span id="app_help_link">[ <a target="_blank" href="https://github.com/cite-architecture/CITE-App/wiki">Online Help</a> ]</span>
		</header>

		<article id="main_Container">

			{ mainMessageDiv.bind }
			<div class="app_tabs">

				<div id="app_tab_texts"
					class={
							CiteMainModel.showTexts.bind match {
								case true => "app_visible app_tab"
								case _ => "app_hidden app_tab"
							}
					}>
					<input type="radio" id="tab-1" name="tab-group-1" checked={ false }/>
					<label class="tab_label" for="tab-1">Browse Texts</label>
						<div class="content">
						 { textView.bind }
						</div>
				</div>

				<div id="app_tab_ng"
					class={
							CiteMainModel.showNg.bind match {
								case true => "app_visible app_tab"
								case _ => "app_hidden app_tab"
							}
					}>
					<input type="radio" id="tab-2" name="tab-group-1" checked={ false }/>
					<label class="tab_label" for="tab-2">Explore Texts</label>
						<div class="content">
						 { ngramView.bind }
						</div>
				</div>



			</div>
		</article>
		<footer>
		{ footer.bind }
		</footer>

	}


	@dom
	def footer = {
		<p>
		{ CiteMainModel.currentLibraryMetadataString.bind }
		</p>
		<p>
		CITE/CTS is ©2002–2017 Neel Smith and Christopher Blackwell. This implementation of the <a href="http://cite-architecture.github.i">CITE</a> data models was written by Neel Smith and Christopher Blackwell using <a href="https://www.scala-lang.org">Scala</a>, <a href="http://www.scala-js.org">Scala-JS</a>, and <a href="https://github.com/ThoughtWorksInc/Binding.scala">Binding.scala</a>. Licensed under the <a href="https://www.gnu.org/licenses/gpl-3.0.en.html">GPL 3.0</a>. Sourcecode on <a href="https://github.com/cite-architecture/ScalaJS-CITE-Environment">GitHub</a>. Copyright and licensing information for the default library is available <a href="https://raw.githubusercontent.com/Eumaeus/cts-demo-corpus/master/CEX-Files/LICENSE.markdown">here</a>.
		</p>
	}

}
