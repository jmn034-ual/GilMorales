import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-lista-resultado')
export class VistaListaResultado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutResultadoBusqueda">
 <vaadin-vertical-layout theme="spacing" id="layoutResultadoUsuario" style="align-self: stretch;"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutResultadoHashtags" style="align-self: stretch;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
