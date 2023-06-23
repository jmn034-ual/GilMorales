import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver-lista-hashtags')
export class VistaVerListaHashtags extends LitElement {
	static get styles() {
		return css`
		:host {
		display: block;
		height: 100%;
		}
		`;
	}

	render() {
		return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; position: fixed; overflow-y: auto;" id="vaadinVerticalLayout1">
 <h1 id="h1" style="align-self: center;">Lista de Hashtags</h1>
 <vaadin-vertical-layout id="vaadinVerticalLayout" style="flex-grow: 1; align-items: center; flex-shrink: 0; width: 100%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="flex-grow: 0; flex-shrink: 0; align-items: flex-start; justify-content: center;"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
	}

	// Remove this method to render the contents of this view inside Shadow DOM
	createRenderRoot() {
		return this;
	}
}
