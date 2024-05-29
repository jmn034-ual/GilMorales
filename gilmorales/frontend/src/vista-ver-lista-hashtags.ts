import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; position: fixed; overflow-y: auto; scrollbar-color: transparent transparent; padding: 0px; margin: 0px;" id="vaadinVerticalLayout1">
 <h1 id="h1" style="flex-grow: 0; align-self: center; flex-shrink: 0;">Lista de Hashtags</h1>
 <hr style="align-self: center; width: 98%; height: 2px; padding-bottom: 0.1%;">
 <vaadin-vertical-layout id="vaadinVerticalLayout" style="flex-grow: 1; width: 100%; flex-shrink: 0; justify-content: flex-start; align-items: center; padding-bottom: 5%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
	}

	// Remove this method to render the contents of this view inside Shadow DOM
	createRenderRoot() {
		return this;
	}
}
