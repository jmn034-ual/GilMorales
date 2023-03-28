import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver-tendencias')
export class VistaVerTendencias extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <h1 id="titulo" style="align-self: center;">Tendencias </h1>
 <vaadin-vertical-layout theme="spacing" id="layoutItem" style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-button id="botonVerListaHashtags" style="align-self: center;">
  Ver Lista Hashtags
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
