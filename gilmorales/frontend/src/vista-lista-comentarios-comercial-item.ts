import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista-comentarios-comercial-item')
export class VistaListaComentariosComercialItem extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" id="nombreDeUsuarioB" style="width: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 15%; align-self: center; justify-content: center;">
  <vaadin-avatar id="avatar"></vaadin-avatar>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 53%;">
  <vaadin-button theme="tertiary" id="nombreDeUsuarioB1">
    Nombre de usuario 
  </vaadin-button>
  <label id="comentarioL" style="margin-left: var(--lumo-space-xs);">Comentario</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="flex-grow: 1; flex-shrink: 0; justify-content: flex-end; margin-right: var(--lumo-space-xs);">
  <label id="label" style="align-self: center;">0</label>
  <vaadin-button id="denunciarB" style="align-self: center; flex-grow: 0; flex-shrink: 0;">
    Denunciar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
